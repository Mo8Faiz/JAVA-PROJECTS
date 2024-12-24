package dev.Faiz.NGO_Search_Engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public Review createReview(String reviewBody, String ngoId){
        Review review =reviewRepository.insert( new Review(reviewBody));
        mongoTemplate.update(ngo.class).matching(Criteria.where("ngoId").is("ngoId")).apply(new Update().push("reviewIds").value(review)).first();
        return review;




    }
}