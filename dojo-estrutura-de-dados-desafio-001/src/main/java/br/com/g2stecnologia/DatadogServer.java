package br.com.g2stecnologia;

import java.time.LocalDateTime;

public interface DatadogServer {

    public void incrementCounter();
    public long getCounter(LocalDateTime from, LocalDateTime until);

}
