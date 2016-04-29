List<DomContent> createEmployeeList(List<Employee> employeeList) {
    List<DomContent> domContent = new ArrayList<>();
    for(Employee employee : employeeList) {
        domContent.add(
            div().withClass("employee").with(
                h2(employee.getName()),
                img().withSrc(employee.getImgPath()),
                p(employee.getTitle())
            )
        );
    }
    return domContent;
}

//call method in your builder
body().with(
    div().withId("employees").with(
        createEmployeeList(employees)
    )
)
