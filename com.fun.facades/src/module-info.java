import com.fun.services.api.UserService;

module com.fun.facades {
    requires com.fun.services.api;

    uses UserService;
}