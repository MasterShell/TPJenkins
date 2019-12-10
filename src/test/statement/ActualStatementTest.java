package test.statement;

import TPRefactoring.statement.ActualStatement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith(JUnit4.class)
public class ActualStatementTest {

    @Test
    public void header() {
        ActualStatement statement = new ActualStatement();
        assertEquals("Rental Record for test\n", statement.header("test"));
    }

    @Test
    public void totalAmountStatement() {
        ActualStatement statement = new ActualStatement();
        assertEquals("Amount owed is 1.0\n", statement.totalAmountStatement(1));
    }

    @Test
    public void frequentRenterPointsStatement() {
        ActualStatement statement = new ActualStatement();
        assertEquals("You earned 1frequent renter points ", statement.frequentRenterPointsStatement(1));
    }
}
