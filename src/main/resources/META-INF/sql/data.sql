--CREATE TRIGGER hashEditInsertTrigger BEFORE INSERT ON contests FOR EACH ROW SET new.editHash = TO_BASE64(RANDOM_BYTES(32));

CREATE TRIGGER hashEditUpdateTrigger BEFORE UPDATE ON contests FOR EACH ROW SET new.editHash = SHA2(TO_BASE64(RANDOM_BYTES(32)), 256);
CREATE TRIGGER hashEditInsertTrigger BEFORE INSERT ON contests FOR EACH ROW SET new.editHash = SHA2(TO_BASE64(RANDOM_BYTES(32)), 256);


---------------------------------------


INSERT INTO contestsdb.categories (id, name) VALUES (1, 'Konkursy muzyczne');
INSERT INTO contestsdb.categories (id, name) VALUES (2, 'Konkursy internetowe');
INSERT INTO contestsdb.categories (id, name) VALUES (3, 'Konkursy SMS');
INSERT INTO contestsdb.categories (id, name) VALUES (4, 'Konkursy fotograficzne');
INSERT INTO contestsdb.categories (id, name) VALUES (5, 'Konkursy lokalne');
INSERT INTO contestsdb.categories (id, name) VALUES (6, 'Konkursy kulinarne');
INSERT INTO contestsdb.categories (id, name) VALUES (7, 'Inne konkursy');
INSERT INTO contestsdb.categories (id, name) VALUES (8, 'Konkursy na Facebooku');

INSERT INTO contestsdb.tags (id, name) VALUES (1, 'książki');
INSERT INTO contestsdb.tags (id, name) VALUES (2, 'kosmetyki');
INSERT INTO contestsdb.tags (id, name) VALUES (3, 'gadżety');
INSERT INTO contestsdb.tags (id, name) VALUES (4, 'pieniężne');
INSERT INTO contestsdb.tags (id, name) VALUES (5, 'alkohol');
INSERT INTO contestsdb.tags (id, name) VALUES (6, 'bilety');
INSERT INTO contestsdb.tags (id, name) VALUES (7, 'samochód');
INSERT INTO contestsdb.tags (id, name) VALUES (8, 'bony');
INSERT INTO contestsdb.tags (id, name) VALUES (9, 'zegarek');

INSERT INTO contestsdb.reward_type (id, name) VALUES (1, 'Elektronika');
INSERT INTO contestsdb.reward_type (id, name) VALUES (2, 'Wycieczki');
INSERT INTO contestsdb.reward_type (id, name) VALUES (3, 'Gadżety');
INSERT INTO contestsdb.reward_type (id, name) VALUES (4, 'Kosmetyki');
INSERT INTO contestsdb.reward_type (id, name) VALUES (5, 'Pieniężne');
INSERT INTO contestsdb.reward_type (id, name) VALUES (6, 'Odzież');
INSERT INTO contestsdb.reward_type (id, name) VALUES (7, 'Inne');
INSERT INTO contestsdb.reward_type (id, name) VALUES (8, 'Dla dzieci');

-- contests --

INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (1, true, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem 2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', 'f417b6b9d8477bcd03ac11b59652f3c722f65bcf07099b216d0b7413e307e450', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/kOCX2g1T-avonmagiczneswieta.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', true, 2);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (2, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', '0940186389ccfa60e586d09a3e78cffa5aa363dbf5309177aa091613a4f11312', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/bakallanditm.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', true, 1);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (3, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', 'd4783075ae905cc473399d55d9226617d81dc4b81b4e5952cfb33a542cdef75d', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/dajcosodsiebietymbark.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 2);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (4, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', 'af77ede4423666ebebefa926a91139a921dc9dc09c5963e11d87362115678ccf', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/ec4.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 2);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (5, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', '03f7f41a6ae91074eb58293b9cd32dd9e6e37ac9836b840dae22de729bf7e7ad', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/gamaloteria.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 3);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (6, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', 'aefab324a6421019b27fa0272642b5039bf73ff0ab23a1c8e9a3f5bec5cce290', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/kamisc4.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 2);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (7, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', '67db0ba9927df6663957cb93d9d5f3af3f22892c1d9866ebbda3d589cf24a0f6', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/lottoswiatecznaloteria.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 2);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (8, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', 'fac4ae9571bd1cf99a40c55a361e6aad5ada881242ca4d0aa0eb196b6d9d7b73', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/pantenec4.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 4);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (9, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', '899a21b8cfe7606b154429583ac99059d2b1d88e2abcc2dbfd45989b13370e90', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/topazgwiazdka.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 2);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (10, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', 'faf7bd7d87c639d8196bb5d381d0504e01619bb5e709c44d2260a9f6e0e1172f', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/wedelleclerc.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', false, 5);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (11, false, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', 'a64bacaf8ec57ea1c3179bf004bc7fdda0fd5c24560e11d55fe122c31790f351', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/zimoodpornybp.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', true, 2);
INSERT INTO contestsdb.contests (id, accepted, contest_link, description, editHash, email, end_date, image, organizer, reward_description, rules_link, short_description, start_date, title, user_accepted, category_id) VALUES (12, true, 'https://www.avon.pl/magiczneswieta', '1. Zrób dowolne zakupy z katalogu AVON 17/2018 o wartości minimum 50 zł, a wraz zamówieniem otrzymasz voucher z unikalnym kodem
2. Zarejestruj swój kod na stronie konkursu, i odpowiedz na pytanie: Dlaczego to właśnie Ty i Twoja rodzinna powinniście pojechać do Disneylandu?', '15ea1becb7ae65e54fcdec538ea3f5cfc2ccf8401761dcc6986d5d6b34884511', 'anna@avon.pl', '2019-01-01 00:00:00', '/upload-dir/zywiecwtesco.jpg', 'AVON', '3x voucher wycieczkowy Rainbow o wartości 10 000 zł z przeznaczeniem na realizację wyjazdu „Bajkowy Paryż”
100x zestaw kosmetyków AVON z linii Kraina Lodu', 'https://zostankonsultantka.avonpolska.pl/lp/pages/contest/pdf/regulamin.pdf', 'Do wygrania 3 vouchery wycieczkowe do Disneylandu oraz zestawy kosmetyków AVON Kraina Lodu!', '2018-12-01 00:00:00', 'Konkurs Magiczne Święta z AVON ', true, 6);

INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (1, 2);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (1, 5);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (2, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (2, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (3, 4);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (3, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (4, 1);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (4, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (5, 1);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (5, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (6, 1);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (6, 1);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (7, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (8, 7);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (9, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (10, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (11, 5);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (11, 3);
INSERT INTO contestsdb.contests_reward_type (contests_id, rewardTypes_id) VALUES (12, 6);

INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (1, 4);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (1, 5);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (2, 6);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (2, 4);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (3, 4);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (3, 2);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (4, 1);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (4, 7);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (5, 4);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (5, 3);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (6, 1);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (6, 6);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (7, 5);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (7, 6);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (8, 3);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (8, 5);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (9, 3);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (9, 8);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (10, 1);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (10, 2);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (11, 4);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (11, 4);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (12, 4);
INSERT INTO contestsdb.contests_tags (contests_id, tags_id) VALUES (12, 4);