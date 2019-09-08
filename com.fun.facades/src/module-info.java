import com.fun.models.services.UserService;

module com.fun.facades {
    requires com.fun.models.services.api;

    uses UserService;
}
