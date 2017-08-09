package ru.antony.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.antony.dao.ProviderSFDao;
import ru.antony.jdbc.SFNameById;

@Component
public class ProviderSFDaoImpl implements ProviderSFDao {
    @Autowired
    private SFNameById sfNameById;

    public String getNameById(Long id) {
        List<String> result = sfNameById.execute(id);
        try {
            return result.get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
}