/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */


package org.taktik.icure.be.drugs.dto;
// Generated Feb 27, 2008 11:38:04 AM by Hibernate Tools 3.2.0.CR1



/**
 * MppId generated by hbm2java
 */
public class MppId  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
     private String id;
     private String lang;

    public MppId() {
    }

    public MppId(String id, String lang) {
       this.id = id;
       this.lang = lang;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getLang() {
        return this.lang;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }

    public String toString() {
    	return "(" + id + "," + lang + ")";
    }

   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MppId) ) return false;
		 MppId castOther = ( MppId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getLang()==castOther.getLang()) || ( this.getLang()!=null && castOther.getLang()!=null && this.getLang().equals(castOther.getLang()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getLang() == null ? 0 : this.getLang().hashCode() );
         return result;
   }   


}


