package com.bzy.ad.service;

import com.bzy.ad.exception.AdException;
import com.bzy.ad.vo.CreateUserRequest;
import com.bzy.ad.vo.CreateUserResponse;


public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
