package io.swagger.Service;

import io.swagger.Repository.MemberRepository;
import io.swagger.api.MemberApi;
import io.swagger.api.NotFoundException;
import io.swagger.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public void addMember(Member body) {
        memberRepository.save(body);
    }


    public void deleteMember(Long id) throws NotFoundException {

        if(memberRepository.exists(id))
        {
            memberRepository.delete(id);
        }else {
            throw new NotFoundException(404,"notFount");
        }

    }


    public List<Member> findAllMember() {
        return memberRepository.findAll();
    }


    public List<Member> findMemberByExpireDate(LocalDate date) {
        return memberRepository.findByExpireDate(date);
    }


    public List<Member> findMemberByJoiningDate(LocalDate date) {
        return memberRepository.findByJoiningDate(date);
    }


    public List<Member> findMemberByType(Member.MemberTypeEnum type) {

        return memberRepository.findByMemberType(type);

    }


    public Member getMemberById(Long id) throws NotFoundException {
        if(memberRepository.exists(id)){
            return   memberRepository.findById(id);
        }else{
            throw new NotFoundException(404,"notFount");
        }
    }




    public Member getMemberByName(String name) throws NotFoundException {
        if(memberRepository.existsByName(name))
        {
            return memberRepository.findByName(name);
        }else{
            throw new NotFoundException(404,"notFount");
        }

    }

    public void updateMember(Member body) throws NotFoundException {
        if(memberRepository.exists(body.getId())) {
            memberRepository.save(body);
        }else {
            throw new NotFoundException(404,"notFount");
        }
    }
}
