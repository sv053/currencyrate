import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("currencyrate")
public class Properties {
    private String selectedCurr;

    public String getSelectedCurr() {
        return selectedCurr;
    }

    public void setSelectedCurr(String selectedCurr) {
        this.selectedCurr = selectedCurr;
    }
}

