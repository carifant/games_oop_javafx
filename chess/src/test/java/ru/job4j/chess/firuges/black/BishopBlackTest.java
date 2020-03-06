package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void positionIsWork() {
        BishopBlack bb = new BishopBlack(Cell.D3);
        assertThat(bb.position(), is(Cell.D3));
    }

    @Test
    public void copyIsWork() {
        BishopBlack bb = new BishopBlack(Cell.D3);
        BishopBlack bb2 = (BishopBlack) bb.copy(Cell.D3);
        assertThat(bb.position(), is(bb2.position()));
    }

    @Test
    public void wayArrIsWork() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] arr = bb.way(Cell.C1, Cell.G5);
        Cell[] exp = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(arr, is(exp));
    }

    @Test(expected = IllegalStateException.class)
    public void wayExceptionIsWork() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        bb.way(Cell.C1, Cell.G6);

    }
}
