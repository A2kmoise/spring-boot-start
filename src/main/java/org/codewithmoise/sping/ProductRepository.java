package org.codewithmoise.sping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends JpaRepository <ProductEntity, Long>, JpaSpecificationExecutor<ProductEntity> {

}
