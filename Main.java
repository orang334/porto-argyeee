package com.portfolio;

/**
 * Backend Java untuk Portfolio Argyadipta Ayatullah Daya
 * 
 * Saat ini masih dalam tahap awal (console/basic structure)
 * Nanti bisa dikembangkan menjadi REST API server menggunakan:
 * - Javalin (lightweight)
 * - Spring Boot (enterprise)
 * - Spark Java (simple)
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     Portfolio Backend - Java Edition   ║");
        System.out.println("║        Argyadipta Ayatullah Daya       ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        
        // Menampilkan informasi backend
        printBackendInfo();
        
        // Simulasi API endpoint yang bisa dikembangkan nanti
        simulateApiEndpoints();
        
        // Menampilkan pesan untuk developer
        showDeveloperNotes();
    }
    
    private static void printBackendInfo() {
        System.out.println("[INFO] Backend Status: Berjalan (Console Mode)");
        System.out.println("[INFO] Frontend Location: ../frontend/");
        System.out.println("[INFO] Port: (Belum ada HTTP server)");
        System.out.println();
    }
    
    private static void simulateApiEndpoints() {
        System.out.println("[API] Endpoint yang direncanakan:");
        System.out.println("  • GET  /api/portfolio     - Mendapatkan data portfolio");
        System.out.println("  • GET  /api/projects      - Mendapatkan list project");
        System.out.println("  • GET  /api/tech-stack    - Mendapatkan tech stack");
        System.out.println("  • POST /api/contact       - Mengirim pesan kontak");
        System.out.println();
    }
    
    private static void showDeveloperNotes() {
        System.out.println("[DEV NOTES]");
        System.out.println("  • Frontend dan backend sudah terpisah dengan jelas");
        System.out.println("  • Untuk koneksi nyata, tambahkan HTTP server di sini");
        System.out.println("  • Contoh: Javalin.create().start(8080)");
        System.out.println("  • Frontend bisa panggil fetch('http://localhost:8080/api/...')");
        System.out.println();
        System.out.println("[✓] Backend siap dikembangkan lebih lanjut");
        System.out.println("[✓] Struktur project scalable dan maintainable");
    }
}