package com.suri.spring.boot.web.controller;

import com.suri.spring.boot.web.model.Topic;
import com.suri.spring.boot.web.model.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: atekumar
 * @Current-Version: 1.0.0
 * @Creation-Date: 04/03/19
 * @Description: (Overwrite)
 * 1. Please describe the business usage of the class.
 * 2. Please describe the technical usage of the class.
 * @History:
 */

@Service
public class TopicService {


    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics =   new ArrayList<>(Arrays.asList(
            new Topic("Spring","Spring Framework","Spring framework Description"),
                new Topic("Java","Core Java","Core Java Description"),
                new Topic("Java script","Java script sss","Java script Description")
        ));


    public List<Topic> getAllTopics(){

        List<Topic> topics= new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;

        /*return topics;*/
    }

    public Topic getTopic(String id){

        return topics.stream().filter(e->e.getId().equals(id)).findFirst().get();
        //return (Topic)topicRepository.findById(id);
    }

    public void add(Topic topic) {

        topicRepository.save(topic);
       // topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {


        topicRepository.save(topic);
       /* for(int i=0;i<topics.size();i++){

            Topic t= topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }*/
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);

       // topics.removeIf(t->t.getId().equals(id));
    }
}