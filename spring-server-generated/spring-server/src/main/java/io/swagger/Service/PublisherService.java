package io.swagger.Service;

import io.swagger.Repository.BookRepository;
import io.swagger.Repository.PublisherRepository;
import io.swagger.api.NotFoundException;
import io.swagger.api.PublishApi;
import io.swagger.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService  {

    @Autowired
    private PublisherRepository publisherRepository;


    public void addPublish(Publisher body) {
        publisherRepository.save(body);
    }


    public void deletePublisher(Long id) throws NotFoundException {
        if(publisherRepository.exists(id))
        {
            publisherRepository.delete(id);
        }else
        {
            throw new NotFoundException(404,"notFount");
        }
    }


    public List<Publisher> findAllPublish() {
        return publisherRepository.findAll();
    }


    public Publisher getPublisherByName(String name) throws NotFoundException{
        if(publisherRepository.existsByName(name))
        {
            return publisherRepository.findByName(name);
        }else
        {
            throw new NotFoundException(404,"notFount");
        }
    }


    public Publisher getpublisherById(Long id) throws NotFoundException{
        if(publisherRepository.exists(id))
        {
            return publisherRepository.findById(id);
        }else {
            throw new NotFoundException(404,"notFount");
        }
    }


    public void updatepublish(Publisher body) throws NotFoundException{
        if(publisherRepository.exists(body.getId())){
            publisherRepository.save(body);
        }else {
            throw new NotFoundException(404,"notFount");
        }

    }
}
