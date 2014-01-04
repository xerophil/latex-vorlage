//Requestfactory initialisieren
final EventBus eventBus = new SimpleEventBus();
requestFactory = GWT.create(ExpensesRequestFactory.class);
requestFactory.initialize(eventBus);

//Request erstellen
EmployeeRequest request = requestFactory.employeeRequest();
EmployeeProxy newEmployee = request.create(EmployeeProxy.class);
newEmployee.setDisplayName(...);
newEmployee.setDepartment(...);
...
Request<Void> createReq = request.persist().using(newEmployee);

//Request abschicken und Antwort verarbeiten
createReq.fire(new Receiver<Void>()
{
  @Override
    public void onSuccess(Void arg0)
    {
        //Ansicht aktualisieren
    }
});