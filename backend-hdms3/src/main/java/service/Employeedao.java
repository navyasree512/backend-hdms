package service;
import java.util.List;

public abstract class Employeedao {
    public abstract List<Employee> getAllEmp();

    public abstract Employee saveEmployee(Employee emp);

    public abstract Employee getEmpById(Long id);

    public abstract Employee updateEmp(Employee emp);

    public abstract void deleteEmp(Long id);
}
