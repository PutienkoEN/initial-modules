import com.fun.services.api.UserService;
import com.fun.services.impl.DefaultUserService;

module com.fun.services {
    exports com.fun.services.impl;

    requires com.fun.core;
    requires com.fun.services.api;

    provides UserService with DefaultUserService;
}