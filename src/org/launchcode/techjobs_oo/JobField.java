package org.launchcode.techjobs_oo;

import java.util.Objects;

public class JobField {
//TODO: set up abstract field to extend to field classes
// figure out the hashcodes

        private int id;
        private static int nextId = 1;
        private String value;

        public JobField() {
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this();
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof org.launchcode.techjobs_oo.JobField)) return false;
            org.launchcode.techjobs_oo.JobField jobField = (org.launchcode.techjobs_oo.JobField) o;
            return getId() == jobField.getId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }


        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

}
