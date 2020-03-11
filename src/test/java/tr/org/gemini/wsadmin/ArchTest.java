package tr.org.gemini.wsadmin;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("tr.org.gemini.wsadmin");

        noClasses()
            .that()
            .resideInAnyPackage("tr.org.gemini.wsadmin.service..")
            .or()
            .resideInAnyPackage("tr.org.gemini.wsadmin.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..tr.org.gemini.wsadmin.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
