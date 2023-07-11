package com.jobportal.Joblisting.repository;

import com.jobportal.Joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post>findByText(String text);


}
