import net.digaly.tom.interpreter.TomVM;

import java.io.IOException;

/**
 * Created by tomdo on 30/11/2016.
 */
public class ProgramFile {
    public static void main(String[] args) throws IOException {
        TomVM vm = new TomVM("resources/test.tom");

        vm.run();
    }
}

