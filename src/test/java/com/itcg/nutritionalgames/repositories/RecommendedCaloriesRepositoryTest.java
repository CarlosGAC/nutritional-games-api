package com.itcg.nutritionalgames.repositories;

import com.itcg.nutritionalgames.entities.RecommendedCalories;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class RecommendedCaloriesRepositoryTest {

    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private EntityManager entityManager;
    @Autowired private RecommendedCaloriesRepository recommendedCaloriesRepository;

    private int existingId = 1;
    private int nonExistingId = 999;

    @Test
    public void injectedComponentsAreNotNull() {
        assertNotNull(dataSource);
        assertNotNull(jdbcTemplate);
        assertNotNull(entityManager);
        assertNotNull(recommendedCaloriesRepository);
    }

    @Test
    public void findAll_ExistingRecommendedCalories_ShouldReturnList() {
        List<RecommendedCalories> calories = recommendedCaloriesRepository.findAll();
        assertFalse(calories.isEmpty());
    }

    @Test
    public void findById_RightId_ShouldReturnObject() {
        Optional<RecommendedCalories> calories = recommendedCaloriesRepository.findById(existingId);
        assertTrue(calories.isPresent());
    }

    @Test
    public void findById_wrongId_ShouldReturnNull() {
        Optional<RecommendedCalories> calories = recommendedCaloriesRepository.findById(nonExistingId);
        assertFalse(calories.isPresent());
    }
}
