Написать следующие SQL запросы:
    1) получить название гор, на которые уже состоялись восхождения

   SELECT DISTINCT table_mountain.name
   FROM table_mountain
   LEFT JOIN table_group
   on table_mountain.id = table_group.mountain_id
   WHERE endDateTime < GETDATE();

    2) получить название гор, на которые не было ни одного восхождения
      SELECT DISTINCT table_mountain.name
      FROM table_mountain
      JOIN table_group
      table_mountain.id = table_group.mountain_id
      WHERE table_group.startDateTime is NULL OR table_group.startDateTime > GETDATE();

       3) получить имена альпинистов, которые ходили в поход на гору с определенным названием
      SELECT  table_mountaineer.mountaineer_name
      FROM table_mountaineer
      LEFT JOIN groups_mountaineers ON table_mountaineer.id = groups_mountaineers.mountaineer_id
      JOIN table_group  ON  groups_mountaineers.group_id = (SELECT * group_id FROM
     table_group JOIN table_mountain ON  table_mountain.id = table_group.mountain_id 
      WHERE table_mountain.name = "Мусала";); 

      4) получить названия и высоту гор, восхождение на которые планируется в определенный интервал времени
      SELECT DISTINCT table_mountain.name, table_mountain.height
      FROM table_mountain
      JOIN table_group
      ON table_mountain.id = table_group.mountains_id
      WHERE table_group.startDateTime BETWEEN 2024 AND 2025;

       5) получить имена альпинистов, которые не записались в новые (время начала похода в будущем) группы

      SELECT DISTINCT table_mountaineer.mountaineer_name
      FROM table_mountaineer
      JOIN table_group
     ON table_mountaineer.id = table_group.mountaineer_id
      WHERE table_group.startDateTime < GETDATE() OR table_group.startDateTime is NULL;





