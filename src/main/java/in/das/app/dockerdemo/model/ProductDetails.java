package in.das.app.dockerdemo.model;

public record ProductDetails(
        String id,
        String name,
        String description,
        String seller,
        double cost
) {}
