package caseStudy.servicee.inter;

import java.io.FileNotFoundException;

public interface CustomerService extends Service {
    void add();
    void edit() throws FileNotFoundException;
}
