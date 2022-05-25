INSERT INTO pasajeros (nombres, apellidos, fecha_de_nacimiento,username, password) VALUES ( 'santiago', 'varela daza','1998-08-07','svarela03', 'miP4551234');
INSERT INTO vehiculos (vehiculo_id, descripcion, matricula, cantidad_de_sillas) VALUES ( 2305, 'Buseta Hyundai Hd-78 2015','RXB-230', 19);
INSERT INTO viajes (origen, destino, costo, fecha_de_salida, hora_de_salida, estado_de_viaje, vehiculo_vehiculo_id) VALUES ( 'bogota', 'choachi',11500 ,'2022-05-24','10:15:00', 'EN_ESPERA', 2305);



INSERT INTO pasajeros_viajes(cantidad_de_asientos, estado_de_pasaje, pasajero_id, viaje_id) VALUES (2, 'RESERVADO', 1, 1);