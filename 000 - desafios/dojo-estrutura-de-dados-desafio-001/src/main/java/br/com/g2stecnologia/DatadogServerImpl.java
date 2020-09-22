package br.com.g2stecnologia;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class DatadogServerImpl implements DatadogServer{
    public Set<LocalDateTime> counter = new HashSet<>();
    @Override
    public void incrementCounter() {
        counter.add(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
    }
    @Override
    public long getCounter(LocalDateTime from, LocalDateTime until) {
        return counter.stream()
                .filter(data -> (data.isEqual(until) || data.isBefore(until)) && (data.isAfter(from) || data.isEqual(from) ))
                .count();
    }
}
