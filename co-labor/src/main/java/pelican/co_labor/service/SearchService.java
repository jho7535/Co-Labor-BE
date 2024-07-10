package pelican.co_labor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pelican.co_labor.domain.enterprise.Enterprise;
import pelican.co_labor.domain.job.Job;
import pelican.co_labor.domain.review.Review;
import pelican.co_labor.repository.enterprise.EnterpriseRepository;
import pelican.co_labor.repository.job.JobRepository;
import pelican.co_labor.repository.review.ReviewRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SearchService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public List<Job> searchJobs(String keyword) {
        return jobRepository.searchJobs(keyword);
    }

    public List<Review> searchReviews(String keyword) {
        return reviewRepository.searchReviews(keyword);
    }

    public List<Enterprise> searchEnterprises(String keyword) {
        return enterpriseRepository.searchEnterprises(keyword);
    }

    public List<Job> searchJobs(List<String> keywords) {
        return keywords.stream()
                .flatMap(keyword -> jobRepository.searchJobs(keyword).stream())
                .distinct()  // 중복 제거
                .collect(Collectors.toList());
    }

    public List<Review> searchReviews(List<String> keywords) {
        return keywords.stream()
                .flatMap(keyword -> reviewRepository.searchReviews(keyword).stream())
                .distinct()  // 중복 제거
                .collect(Collectors.toList());
    }

    public List<Enterprise> searchEnterprises(List<String> keywords) {
        return keywords.stream()
                .flatMap(keyword -> enterpriseRepository.searchEnterprises(keyword).stream())
                .distinct()  // 중복 제거
                .collect(Collectors.toList());
    }



}
