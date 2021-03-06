package id.ac.tazkia.dosen.dao;

import id.ac.tazkia.dosen.entity.Dosen;
import id.ac.tazkia.dosen.entity.Jabatan;
import id.ac.tazkia.dosen.entity.KategoriKegiatan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yogi on 04/05/2017.
 */

@Repository
public interface KategoriKegiatanDao extends PagingAndSortingRepository<KategoriKegiatan, String> {

}