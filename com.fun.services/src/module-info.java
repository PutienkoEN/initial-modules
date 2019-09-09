import com.fun.services.UserService;
import com.fun.services.impl.DefaultUserService;

module com.fun.services {
    exports com.fun.services;

    requires com.fun.core;
    requires transitive com.fun.models;

    provides UserService with DefaultUserService;
}