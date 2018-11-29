﻿--CREATE TRIGGER hashEditInsertTrigger BEFORE INSERT ON contests FOR EACH ROW SET new.editHash = TO_BASE64(RANDOM_BYTES(32));

CREATE TRIGGER hashEditUpdateTrigger BEFORE UPDATE ON contests FOR EACH ROW SET new.editHash = TO_BASE64(RANDOM_BYTES(32));
CREATE TRIGGER hashEditInsertTrigger BEFORE INSERT ON contests FOR EACH ROW SET new.editHash = TO_BASE64(RANDOM_BYTES(32));

INSERT INTO contestsdb.categories (id, name, type) VALUES (1, 'alkoholą', 'tag');
INSERT INTO contestsdb.categories (id, name, type) VALUES (2, 'prezentyę', 'tag');
INSERT INTO contestsdb.categories (id, name, type) VALUES (3, 'Internetoweł', 'category');
INSERT INTO contestsdb.categories (id, name, type) VALUES (4, 'wycieczkaŃ', 'reward_type');
--
--ok
--INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (null, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/BrXBay18-dajcosodsiebietymbark.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (1, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/BrXBay18-dajcosodsiebietymbark.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (2, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/HzSLTMsm-pantenec4.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (3, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/wLH4qu08-topazgwiazdka.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (4, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/Y0RtwEkE-bakallanditm.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (5, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/BrXBay18-dajcosodsiebietymbark.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (6, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/HzSLTMsm-pantenec4.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (7, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/wLH4qu08-topazgwiazdka.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (8, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/Y0RtwEkE-bakallanditm.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (9, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/BrXBay18-dajcosodsiebietymbark.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (10, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/HzSLTMsm-pantenec4.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (11, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/wLH4qu08-topazgwiazdka.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');
INSERT INTO contestsdb.contests (id, contest_link, description, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title) VALUES (12, 'https://www.loteria.dajcosodsiebie.pl/#zasady', '1. Kup dowolne produkty Tymbark za minimum 6 zł spośród soków, nektarów i napojów od 0,2l do 0,3l) i zachowaj paragon', '2018-12-30 22:59:00', '/upload-dir/Y0RtwEkE-bakallanditm.jpg', 'Tymark', '– 1x samochód Toyota C-HR – 210x bon podarunkowy YES o wartości 200 zł (codziennie 5 nagród)', 'https://www.loteria.dajcosodsiebie.pl/regulaminy/Regulamin%20loterii%20Tymbark.pdf', 'Do wygrania Toyota C-HR oraz bony upominkowe YES o wartości 200 zł!', '2018-11-18 23:00:00', 'ŚWIĄTECZNA LOTERIA TYMBARK DAJ COŚ OD SIEBIE');

INSERT INTO contestsdb.contests_categories (contests_id, categories_id) VALUES (1, 2);
INSERT INTO contestsdb.contests_categories (contests_id, categories_id) VALUES (1, 3);
INSERT INTO contestsdb.contests_categories (contests_id, categories_id) VALUES (1, 4);