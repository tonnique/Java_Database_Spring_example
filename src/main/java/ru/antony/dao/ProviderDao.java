package ru.antony.dao;

import java.util.List;
import ru.antony.model.Provider;

public interface ProviderDao {
    public List<Provider> findAll();
    public Provider findById(Long id);
    public Long insert(Provider provider);
    public Long insertWithItems(Provider provider);
    public void update(Provider provider);
    public void delete(Provider provider);
}