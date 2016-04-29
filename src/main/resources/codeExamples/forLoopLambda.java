body().with(
    div().withId("employees").with(
        employees.stream().map(employee ->
            div().withClass("employee").with(
                h2(employee.getName()),
                img().withSrc(employee.getImgPath()),
                p(employee.getTitle())
            )
        ).collect(Collectors.toList())
    )
)
