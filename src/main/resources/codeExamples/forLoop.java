//create function for displaying employees (could also use regular for-loop)
List<Tag> createEmployeeList(List<Employee> list) {
return list.stream().map(employee ->
    div().withClass("employee").with(
        h2(employee.getName()),
            img().withSrc(employee.getImgPath()),
            p(employee.getTitle())
        )
    ).collect(Collectors.toList());
}

//call method in your builder
body.with(
    div().withId("employees").with(
        createEmployeeList(employees)
    )
)
