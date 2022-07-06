package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Student#Student()}
     *   <li>{@link Student#setAge(Integer)}
     *   <li>{@link Student#setEmail(String)}
     *   <li>{@link Student#setFirstName(String)}
     *   <li>{@link Student#setId(Long)}
     *   <li>{@link Student#setLastName(String)}
     *   <li>{@link Student#getAge()}
     *   <li>{@link Student#getEmail()}
     *   <li>{@link Student#getFirstName()}
     *   <li>{@link Student#getId()}
     *   <li>{@link Student#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Student actualStudent = new Student();
        actualStudent.setAge(1);
        actualStudent.setEmail("jane.doe@example.org");
        actualStudent.setFirstName("Jane");
        actualStudent.setId(123L);
        actualStudent.setLastName("Doe");
        assertEquals(1, actualStudent.getAge().intValue());
        assertEquals("jane.doe@example.org", actualStudent.getEmail());
        assertEquals("Jane", actualStudent.getFirstName());
        assertEquals(123L, actualStudent.getId().longValue());
        assertEquals("Doe", actualStudent.getLastName());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Student#Student(Long, String, String, String, Integer)}
     *   <li>{@link Student#setAge(Integer)}
     *   <li>{@link Student#setEmail(String)}
     *   <li>{@link Student#setFirstName(String)}
     *   <li>{@link Student#setId(Long)}
     *   <li>{@link Student#setLastName(String)}
     *   <li>{@link Student#getAge()}
     *   <li>{@link Student#getEmail()}
     *   <li>{@link Student#getFirstName()}
     *   <li>{@link Student#getId()}
     *   <li>{@link Student#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Student actualStudent = new Student(123L, "Jane", "Doe", "jane.doe@example.org", 1);
        actualStudent.setAge(1);
        actualStudent.setEmail("jane.doe@example.org");
        actualStudent.setFirstName("Jane");
        actualStudent.setId(123L);
        actualStudent.setLastName("Doe");
        assertEquals(1, actualStudent.getAge().intValue());
        assertEquals("jane.doe@example.org", actualStudent.getEmail());
        assertEquals("Jane", actualStudent.getFirstName());
        assertEquals(123L, actualStudent.getId().longValue());
        assertEquals("Doe", actualStudent.getLastName());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Student#Student()}
     *   <li>{@link Student#setAge(Integer)}
     *   <li>{@link Student#setEmail(String)}
     *   <li>{@link Student#setFirstName(String)}
     *   <li>{@link Student#setId(Long)}
     *   <li>{@link Student#setLastName(String)}
     *   <li>{@link Student#getAge()}
     *   <li>{@link Student#getEmail()}
     *   <li>{@link Student#getFirstName()}
     *   <li>{@link Student#getId()}
     *   <li>{@link Student#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor3() {
        Student actualStudent = new Student();
        actualStudent.setAge(1);
        actualStudent.setEmail("jane.doe@example.org");
        actualStudent.setFirstName("Jane");
        actualStudent.setId(123L);
        actualStudent.setLastName("Doe");
        assertEquals(1, actualStudent.getAge().intValue());
        assertEquals("jane.doe@example.org", actualStudent.getEmail());
        assertEquals("Jane", actualStudent.getFirstName());
        assertEquals(123L, actualStudent.getId().longValue());
        assertEquals("Doe", actualStudent.getLastName());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Student#Student(Long, String, String, String, Integer)}
     *   <li>{@link Student#setAge(Integer)}
     *   <li>{@link Student#setEmail(String)}
     *   <li>{@link Student#setFirstName(String)}
     *   <li>{@link Student#setId(Long)}
     *   <li>{@link Student#setLastName(String)}
     *   <li>{@link Student#getAge()}
     *   <li>{@link Student#getEmail()}
     *   <li>{@link Student#getFirstName()}
     *   <li>{@link Student#getId()}
     *   <li>{@link Student#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor4() {
        Student actualStudent = new Student(123L, "Jane", "Doe", "jane.doe@example.org", 1);
        actualStudent.setAge(1);
        actualStudent.setEmail("jane.doe@example.org");
        actualStudent.setFirstName("Jane");
        actualStudent.setId(123L);
        actualStudent.setLastName("Doe");
        assertEquals(1, actualStudent.getAge().intValue());
        assertEquals("jane.doe@example.org", actualStudent.getEmail());
        assertEquals("Jane", actualStudent.getFirstName());
        assertEquals(123L, actualStudent.getId().longValue());
        assertEquals("Doe", actualStudent.getLastName());
    }
}

