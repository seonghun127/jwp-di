package nextstep.di.factory.example;

import nextstep.annotation.Inject;

public class PrimitiveTypeInjectController {
    private final int a;

    @Inject
    public PrimitiveTypeInjectController(int a) {
        this.a = a;
    }
}