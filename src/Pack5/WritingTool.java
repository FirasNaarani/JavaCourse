package Pack5;

import Pack5.Interfaces.Eraser;

public class WritingTool  implements Eraser {
    private String color;

    @Override
    public void erase() {
        System.out.println("Writing Tool Eraser.");
    }
}
