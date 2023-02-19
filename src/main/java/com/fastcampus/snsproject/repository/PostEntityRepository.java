package com.fastcampus.snsproject.repository;

import com.fastcampus.snsproject.model.entity.PostEntity;
import com.fastcampus.snsproject.model.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostEntityRepository extends JpaRepository<PostEntity,Integer> {

    public Page<PostEntity> findAllByUser(UserEntity userEntity, Pageable pageable);
    public Page<PostEntity> findAllByUserId(Integer userId, Pageable pageable);
}