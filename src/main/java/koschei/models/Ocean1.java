package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ocean1")
public class Ocean1 {

    @Autowired //Океан связан с островом через поле
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
