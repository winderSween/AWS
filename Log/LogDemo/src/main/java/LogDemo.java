import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogDemo {

    public static void main(String[] args) {
        log.debug("This is debug level log.");
        log.info("This is info level log.");
        log.error("error");
    }
}
