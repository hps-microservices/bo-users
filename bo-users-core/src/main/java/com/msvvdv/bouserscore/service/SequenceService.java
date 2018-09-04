package com.msvvdv.bouserscore.service;

public interface SequenceService {
    long getNextSequenceId(String key) throws SecurityException;
}
