package com.okta.springbootvue.Showtime.entity;
import lombok.*;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Data
@Entity
@NoArgsConstructor
@Table(name="SHOWLOCATION")
public class ShowLocation {
    @Id
    @SequenceGenerator(name="LOCAL_SEQ",sequenceName="LOCAL_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="LOCAL_SEQ")
    @Column(name="SHOWLOCATION_ID",unique = true, nullable = true)
    private @NonNull Long id;

    private @NonNull String location;

  }