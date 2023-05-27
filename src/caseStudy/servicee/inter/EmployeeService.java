package caseStudy.servicee.inter;

import java.io.IOException;

public interface EmployeeService extends Service {
    void add() throws IOException;
    void edit();

    void removee();

    void display() throws Exception;
}
