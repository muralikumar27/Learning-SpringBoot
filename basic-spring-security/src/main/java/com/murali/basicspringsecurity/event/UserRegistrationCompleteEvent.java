package com.murali.basicspringsecurity.event;

import com.murali.basicspringsecurity.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/*
* UserRegistrationCompleteEvent class will be instantiated
* from the Controller layer while publishing the event
*  after saving the User to the DB and the
* applicationUrl will also be created in controller layer
*/
@Getter
@Setter
public class UserRegistrationCompleteEvent extends ApplicationEvent {

    private User user;
    private String applicationUrl;
    public UserRegistrationCompleteEvent(User user, String applicationUrl ) {
        super(user);
        this.user=user;
        this.applicationUrl=applicationUrl;
    }
}
