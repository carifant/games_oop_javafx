package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test
    public void whenMoveIsWork() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        boolean result = logic.move(Cell.C1, Cell.G5);
        assertThat(result, is(true));
    }

    @Test(expected = IllegalStateException.class)
    public void whenMoveIsNotRight() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.G6);
    }

    @Test(expected = IllegalStateException.class)
    public void whenMoveThroughFigures() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.B2));
        logic.add(new PawnBlack(Cell.D2));
        logic.add(new PawnBlack(Cell.E2));
        logic.move(Cell.C1, Cell.G6);

    }
}
