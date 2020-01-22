package com.jbajracharya.songr;

import org.springframework.data.jpa.repository.JpaRepository;

//inside diamond<TypeOfThingGoingIntoDb, TypeOfThatThing'sId>
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
