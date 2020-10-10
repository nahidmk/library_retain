package io.swagger.Repository;

import io.swagger.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.threeten.bp.LocalDate;


import java.util.Date;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    public List<Member> findByJoiningDate(LocalDate date);
    public List<Member> findByExpireDate(LocalDate date);
    public List<Member> findByMemberType(Member.MemberTypeEnum Type);
    public Member findByName(String name);
    public boolean existsByName(String name);
    Member findById (Long id);
}
