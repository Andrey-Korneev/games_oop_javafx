package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenCreateFigure() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void whenCopyFigure() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.copy(Cell.B2).position(), is(Cell.B2));
    }

    @Test
    public void whenWayFigureIsCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        Cell[] expected = { Cell.D2, Cell.E3, Cell.F4, Cell.G5 };
        assertArrayEquals(expected, way);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayFigureIsNotCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G3);
        Cell[] expected = { Cell.D2, Cell.E3, Cell.F4, Cell.G5 };
        assertArrayEquals(expected, way);
    }

}