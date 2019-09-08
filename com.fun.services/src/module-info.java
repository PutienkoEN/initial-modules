import com.fun.models.services.UserService;
import com.fun.services.impl.DefaultUserService;

module com.fun.services {
    requires com.fun.models.services.api;
    requires com.fun.core;

    provides UserService with DefaultUserService;
}
