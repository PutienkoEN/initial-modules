import com.fun.services.UserService;

module com.fun.facades {
    requires com.fun.services;

    uses UserService;
}