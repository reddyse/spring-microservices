package com.praneethsettipalli.userservice.service;

import com.praneethsettipalli.userservice.VO.Department;
import com.praneethsettipalli.userservice.VO.ResponseTemplateVO;
import com.praneethsettipalli.userservice.entity.UserObject;
import com.praneethsettipalli.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public UserObject saveUser(UserObject user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId){
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        UserObject user = userRepository.findByUserId(userId);
        /* Leveraging service registry and using name "DEPARTMENT-SERVICE" instead of hostname and port number  */
        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId()
                        ,Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
