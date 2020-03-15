package codewars.com.minions.whackamole;

/**
 * Class.
 */
public class MatrixPrint implements MatrixActions {
    /**
     *  {@inheritDoc}
     */
    @Override
    public void action(final WhackAMole myW) {
        myW.getMyStringBuilder().append(myW.getMoleGrid()[myW.getRow()][myW.getCol()]).append(" ");
    }
}
