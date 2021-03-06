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

package org.taktik.icure.be.ehealth.logic.chapter4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: aduchate
 * Date: 07/06/13
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
public class Appendix implements Serializable {
    private Long verseSeq;
    private Long documentSeq;
    private String mimeType;
    private String path;
    private byte[] data;

    public Appendix() {
    }

    public Appendix(Long verseSeq, Long documentSeq, byte[] data) {
        this.data = data;
        this.verseSeq = verseSeq;
        this.documentSeq = documentSeq;
    }

    public Long getVerseSeq() {
        return verseSeq;
    }

    public void setVerseSeq(Long verseSeq) {
        this.verseSeq = verseSeq;
    }

    public Long getDocumentSeq() {
        return documentSeq;
    }

    public void setDocumentSeq(Long documentSeq) {
        this.documentSeq = documentSeq;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}
